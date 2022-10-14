package com.shshetudev.gql_demo.person;

import com.shshetudev.gql_demo.person.domain.Address;
import com.shshetudev.gql_demo.person.domain.AddressRepository;
import com.shshetudev.gql_demo.person.domain.Person;
import com.shshetudev.gql_demo.person.domain.PersonRepository;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.graphql.data.method.annotation.SchemaMapping;
import org.springframework.stereotype.Controller;

import java.util.List;
import java.util.Optional;

@Controller
public class GraphQLController {
    private PersonRepository personRepository;
    private AddressRepository addressRepository;

    public GraphQLController(PersonRepository personRepository, AddressRepository addressRepository) {
        this.personRepository = personRepository;
        this.addressRepository = addressRepository;
    }

    // type Query
    @QueryMapping(value = "person")
    // Same as @QueryMapping
//    @SchemaMapping(typeName = "Query", value = "person")
    public Optional<Person> getPerson(@Argument(name = "id") Integer id) {
        // todo: Replace with logger
        System.out.println("Querying Person");
        return personRepository.findById(id);
    }

    // address field will be fetched
    @SchemaMapping(value = "address")
    public List<Address> getAddress(Person person) {
        System.out.println("Fetching address");
        return addressRepository.findByPersonId(person.getId());
    }

    // phone field will be fetched
    @SchemaMapping(value = "phone")
    public String getPhone(Person person) {
        System.out.println("Fetching phone");
        throw new RuntimeException("Did not find phone data");
    }

    // type Mutation: createPerson
    // todo: provide dto as input
    @MutationMapping(name = "createPerson")
    public Person addPerson(@Argument(name = "person") Person person) {
        return personRepository.save(person);
    }

    // type Mutation: createAddress
    // todo: provide dto as input
    @MutationMapping(name = "createAddress")
    public Address addAddress(@Argument(name = "address") Address address) {
        return addressRepository.save(address);
    }
}
