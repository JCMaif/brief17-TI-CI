# brief17

## Test d'intégration

Implémenter le test d'intégration pour vérifier que le StudentService insère bien en base un Student. 

Vous devrez d'abord configurer l'application pour les tests grâce au fichier application-test.properties dans le dossier resources des tests.

## Utilisation de la CI Github pour lancer le test d'intégration

Vous implémenterez une CI github pour lancer les tests de l'application.

## Résolution

J'ai choisi de tester directement le repository plutôt que le service, ça me semble plus logique pour un test d'intégration mais je comprends que c'est discutable.

Dans la CI Github Action, j'ai commenté le lancement des tests avant le package, car ça fait double emploi mais je voulais montrer ce step.
