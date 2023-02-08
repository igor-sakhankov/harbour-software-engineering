### Summary

Fill in the spots in *italics*.

*Add a brief reasoning for the PR here, a few sentences describing the PR so that anyone from your team or another team can get a grasp on the scope of the changes.*

[See the Ticket with more details](put the url here)

## Release Notes
### Breaking changes

*List of breaking changes or remove if it not applied. Sample:*

- POST /parcels
    - Re-upload not allowed for V2
- Routing Algorithm
    - Parameter X removed

### How to monitor?

*Link or name here useful logs, metrics and alerts. Some samples:*

**Critical Alerts**
- HTTP Server Errors
- Latency P90 > 1000ms

**Non Critical Alerts**
- HTTP Client Errors

**Metrics**
- coordinates.failure.count
    - Number of Parcels sent to coordinate failure

**Log Events**
- config-load-failed
    - WARN in case of x condition

### How to rollback?

**Toggles:**
- TOOGLE_A_ENABLED=false
- TOOGLE_B_ENABLED=true

**In case of emergency, rollback to build:** *previous (or specify the number if it needed)*

## Checklist

- [X] PR Conventions
    - [X] [Branch and commit naming conventions].
    - [X] PR name like: [[Ticket Number] <type>*: PR Title like commit convention]
    - [X] 2 approvals (except for after hours On-Call mitigations)
- [X] Quality Gate
    - [X] Unit test coverage is passing
    - [X] Code smells mitigated
    - [X] Following the [Java code style]
- [X or N/A] DB Migrations
    - [ ] Applied [database migration guidelines]
    - [ ] Added Component Tests for the repository updates
- [X or N/A] Observability
    - [ ] Created resources for HTTP Endpoints and Event Subscribers
    - [ ] Defined critical and non-critical alerts
- [X or N/A] Breaking changes
    - [ ] Keeping the old implementation behind a Feature Toggle
    - [ ] Documented Toggles and Rollback strategy
    - [ ] Applied [API versioning]
