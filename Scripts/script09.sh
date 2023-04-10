#!/bin/bash
set -e

echo 'Adivina el valor numerico de la variable'
read variable #entrada de datos

if [ $variable = 1 ]; then
    echo 'Acertaste'
    exit 0
elif [ $variable = 2 ]; then 
    echo 'casi!' 
else
    echo 'No acertaste'
fi

exit 0