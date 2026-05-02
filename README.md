<img width="10%" src="https://raw.githubusercontent.com/7mind/baboon-intellij//main/src/main/resources/icons/baboon.svg?sanitize=true" alt="Baboon"/>

# Intellij Plugin for Baboon DML

Syntax highlighting for [Baboon DML](https://github.com/7mind/baboon)

Published on [JetBrains Marketplace](https://plugins.jetbrains.com/plugin/28203-baboon-support)

## Maintenance status

As of 2026-05-02 this IntelliJ extension is in a dormant rename-from-Idealingua state:

- The live generated parser at `src/main/gen/io/septimalmind/idealingua/...` is still produced from the legacy `Idealingua.bnf`.
- The active Kotlin source still lives in the `io.septimalmind.idealingua.idealinguaintellij` package.
- No `generateParser` / `generateLexer` Grammar-Kit task is wired in `build.gradle.kts`.
- No `gradle test` target exists; the extension is not built or tested by `mdl :ci`.

Grammar parity with the Scala compiler (and with the Zed / VSCode editors) is therefore best-effort and lags the canonical compiler. PRs touching `editors/baboon-intellij/**` are not gated on grammar parity. The M18 `id` keyword and M20 ADT branch inheritance operators (`+ X` / `- X` / `^ X`) are NOT supported by this extension's BNF as of M27.

To resume active maintenance, a follow-up M-task should: (1) complete the `idealingua → baboon` package rename across `src/main/kotlin/`, (2) wire Grammar-Kit's `generateParser` task in `build.gradle.kts`, (3) regenerate the parser/lexer from `src/main/grammar/Baboon.bnf`, (4) extend `Baboon.bnf` with `id` keyword token + `id_def` rule and widen `adt_member` to admit `+ X` / `- X` / `^ X`, (5) add a smoke test in `src/test/`. Estimated 2-3 days.
