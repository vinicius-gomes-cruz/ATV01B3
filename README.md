# 💻 Projeto JavaFX — Exemplos de Layouts e Componentes

Este projeto contém exemplos práticos de uso do **JavaFX**, incluindo layouts (`VBox`, `HBox`, `BorderPane`, `GridPane`, etc.), componentes com eventos, validações e comportamento responsivo.

---

## ✅ Pré-requisitos

- **Java 21+**
- **JavaFX SDK 21+**



> 🔽 Baixe o JavaFX SDK em: [https://gluonhq.com/products/javafx/](https://gluonhq.com/products/javafx/)

---

## ▶️ Executar um arquivo Java

Use o script `run.sh` para compilar e rodar qualquer exemplo.

### Exemplo: Executar `ExemploVBox.java`

1. Abra o terminal na pasta do projeto.

2. Edite o `run.sh` com o nome da classe que você quer rodar:

```bash
#!/bin/bash

JAVA_FX_LIB="./javafx/lib"
ARQUIVO="exercicios.ExemploVBox"  # Nome da classe com pacote
FONTE="src/${ARQUIVO//./\/}.java" # Converte para caminho de arquivo

# Compilar
javac --module-path $JAVA_FX_LIB --add-modules javafx.controls,javafx.fxml -d out "$FONTE"

# Executar
java --module-path $JAVA_FX_LIB --add-modules javafx.controls,javafx.fxml -cp out $ARQUIVO


chmod +x run.sh

./run.sh
