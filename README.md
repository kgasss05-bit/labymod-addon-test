# AutoSubtitle Addon (skeleton)

Minimal Projektstruktur, damit der Build auf GitHub Actions durchläuft und ein JAR erzeugt.
**Hinweis:** Dies ist ein neutrales Java-Skeleton ohne LabyMod-APIs, damit es ohne externe Abhängigkeiten baut.

## Struktur
- `core/src/main/java/org/ulgu/autosubtitle/AutoSubtitleAddon.java`
- `core/src/main/java/org/ulgu/autosubtitle/AutoSubtitleConfiguration.java`
- `core/src/main/resources/addon.json`
- `core/build.gradle.kts`
- `settings.gradle.kts` (root)
- `build.gradle.kts` (root)
- GitHub Actions Workflow

## Build lokal
```bash
./gradlew :core:build
```

Das fertige JAR liegt danach unter `core/build/libs/`.