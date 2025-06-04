### Sudenaz Keskin 
# Flugapi295 – Backend-API für Startflughafen und Flüge

## Beschreibung
Dieses Projekt stellt eine REST-API zur Verwaltung von Startflughäfen und Flügen bereit. Es wurde als Teil eines Praktikums erstellt und verwendet Spring Boot, Spring Data JPA und Spring Security.
## Features
✅ Verwaltung von Startflughäfen (CRUD)<br>
✅ Validierungen von Daten (z.B. Pflichtfelder, Feldlängen, Logik)<br>
✅ Benutzer- und Rollenkonzept (ADMIN/USER)<br>
✅ Authentifizierung per HTTP Basic Auth<br>
✅ OpenAPI-Dokumentation (Swagger)<br>
✅ Integrationstests und Validierung der REST-API<br>
## ERD / Datenbankdiagramm
![img.png](src%2Fmain%2Fresources%2Fimg%2Fimg.png)
## 7️⃣ Klassendiagramm
![img_1.png](src%2Fmain%2Fresources%2Fimg%2Fimg_1.png)
## Validierungsregeln
Im Entity Startflughafen:<br>
✅ Name: 3–100 Zeichen<br>
✅ Land: Muss mit einem Großbuchstaben beginnen<br>
✅ Landebahnen: mindestens 1<br>
✅ Eroeffnet: Datum in der Vergangenheit oder Gegenwart<br>
## Berechtigungsmatrix
Ressource	ADMIN	USER<br>
Alle Startflughäfen (GET)	✅	✅<br>
Startflughafen erstellen	✅	❌<br>
Startflughafen aktualisieren	✅	❌<br>
Startflughafen löschen	✅	❌<br>
## OpenAPI Dokumentation
Die API ist mit Swagger dokumentiert und erreichbar unter:<br>
http://localhost:8080/swagger-ui.html
## Testdurchführung
Die Tests decken folgende Aspekte ab:<br>
✅ Positiv-Tests (z.B. erfolgreiches Erstellen, Abrufen)<br>
✅ Negativ-Tests (z.B. Validierungsfehler)<br>
✅ Sicherheitstests (Rollen und Berechtigungen)<br>
## Git & Versionierung
Dieses Projekt wird mit Git verwaltet.
## Autor
Name: Sudenaz Keskin<br>
Datum: 04.06.2025
## Zusammenfassung
Dieses Backend-Projekt demonstriert eine einfache, aber realitätsnahe REST-API mit Fokus auf:

Sichere Benutzerrollen 

Saubere Tests

Klare Strukturierung 

