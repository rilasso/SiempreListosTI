#!/bin/bash
set -e

echo 'Adivina el valor numerico de la variable'
read variable #entrada de datos

if [ $variable = 1 ]; then
    echo 'Acertaste'
    exit 0
fi
echo 'No acertaste'