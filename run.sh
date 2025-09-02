#!/bin/bash

# Caminho para a pasta lib do JavaFX SDK
PATH_TO_FX="/home/aluno/javafx/lib"

# Verifica se o parâmetro foi passado
if [ -z "$1" ]; then
    echo "Uso: ./run.sh <numero_do_exercicio>"
    echo "Exemplo: ./run.sh 3"
    exit 1
fi

EX=$1

# Verifica se o número é válido (1-14)
if [[ ! $EX =~ ^[1-9]$|^1[0-4]$ ]]; then
    echo "Exercício inválido! Digite um número entre 1 e 14."
    exit 1
fi

# Nome do arquivo e da classe
FILE="src/Exercicio${EX}.java"
CLASS="Exercicio${EX}"

# Compilar
javac --module-path "$PATH_TO_FX" --add-modules javafx.controls,javafx.fxml -d out src/Exercicio${EX}.java
if [ $? -ne 0 ]; then
    echo "Erro na compilação."
    exit 1
fi

# Rodar
java --module-path "$PATH_TO_FX" --add-modules javafx.controls,javafx.fxml -cp out "$CLASS"


