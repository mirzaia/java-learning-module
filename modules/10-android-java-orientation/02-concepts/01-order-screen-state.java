package examples;

/*
Android UI must represent work that finishes later. Model it explicitly instead of using several
unrelated boolean flags, which can accidentally describe impossible states such as loading + error.
*/
sealed interface OrderScreenState permits Loading, Content, Failure { }
record Loading() implements OrderScreenState { }
record Content(java.util.List<String> orderIds) implements OrderScreenState { }
record Failure(String message) implements OrderScreenState { }
