# C Mail — customization register

This file tracks changes made by C Mail on top of Thunderbird for Android.

## Upstream policy

- `main` is kept as close as possible to Thunderbird Android upstream.
- C Mail development is performed on `cmail/develop` and dedicated feature branches.
- Thunderbird code should not be modified unless an integration point is strictly necessary.
- C Mail-specific code should live in dedicated `app-cmail` / `feature-cmail-*` modules where practical.
- Every unavoidable upstream modification must be documented here with file paths and rationale.
- Upstream updates are integrated first, then C Mail integration points are reviewed and tested.

## Product identity

- Product name: **C Mail**
- Planned Android application module: `app-cmail`
- Planned application ID: `it.curati.cmail`
- Base project: Thunderbird for Android / K-9 Mail

## Planned C Mail features

1. Unified bottom navigation: Posta, Etichette, Modelli, Archivi.
2. Multi-account aggregate views with per-account filtering.
3. Aruba IMAP `Modelli` folder integration for server-side templates.
4. Multiple signatures.
5. Labels/tags management.
6. Dedicated archive browser across accounts.
7. Per-account notification schedules with silent periods while synchronization continues.
8. C Mail visual identity and application icon.

## Integration log

### Initial setup
- Created `cmail/develop` from `main`.
- Added this customization register.
- No Thunderbird source files modified yet.
