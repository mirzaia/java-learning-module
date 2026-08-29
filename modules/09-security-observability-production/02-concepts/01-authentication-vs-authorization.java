package examples;

/*
Authentication asks "who is this caller?". Authorization asks "may this caller perform this action?".

For the order API:
  GET /orders           -> public in this learning example
  POST /orders          -> requires an authenticated caller
  PATCH /orders/{id}    -> requires an authenticated caller
  GET /actuator/health  -> public so orchestration can check readiness

The module's SecurityConfiguration implements those HTTP method and path rules.
*/
final class AuthenticationVsAuthorization { }
