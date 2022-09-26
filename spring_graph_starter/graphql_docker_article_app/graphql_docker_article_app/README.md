## To run the application execute
```groovy
./gradlew clean build
docker compose up
```

## Open the graphql ui
`http://localhost:8080/graphiql`

## schema.graphqls description
- schemas provide automatic code generation, validation and parsing, introspection, and type safety of our APIs.
- **Article** is a GraphQL `ObjectType`.
- **title: String** is a field of the `Article` type.
- **String** is one of the built-in `scalar` types.
- **String!** means that the field is non-nullable.
- **[Comment]** represents an array of `Comment` objects. It is possible to make `[Comment]` array non-nullable by `[Comment!]!`
- **Query**
  - `Query` type is a special object type that defines all the **top-level entry points** for queries clients execute against our server.
  - Each field of the `Query` type defines the name and return type of different entry point.
- **Mutation**
  - The `Mutation` type is similar in structure and purpose to the `Query` type.
  - Whereas the `Query` type defines entry points for read operations, the `Mutation` type defines entry points for `write` operations.
