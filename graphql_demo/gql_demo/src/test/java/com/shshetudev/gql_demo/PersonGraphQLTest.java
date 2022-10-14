package com.shshetudev.gql_demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.graphql.tester.AutoConfigureGraphQlTester;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.graphql.test.tester.GraphQlTester;

@SpringBootTest
@AutoConfigureGraphQlTester
class PersonGraphQLTest {
    @Autowired
    private GraphQlTester graphQlTester;

    @Test
    void shouldAddPersonAndQueryBack() {
        this.graphQlTester.documentName("person-mutation")
                .execute()
                .path("createPerson.name")
                .entity(String.class).isEqualTo("Shahariar");

        this.graphQlTester.documentName("person-query")
                .variable("id", 1)
                .execute()
                .path("person.name")
                .entity(String.class).isEqualTo("Shahariar");
    }
}
