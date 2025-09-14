# AutoSubtitle (LabyMod Addon)

Ein minimaler LabyMod-Addon-Skeleton für Minecraft **1.21.5**.

## Struktur
- `core/` Modul mit Code
- GitHub Actions Workflow baut das Projekt mit Gradle (ohne Wrapper)
- Artefakt wird als `.jar` hochgeladen

## Build lokal
Voraussetzung: Gradle 8+ und Java 21
```bash
gradle build
```
Das Ergebnis liegt unter `core/build/libs/`.
