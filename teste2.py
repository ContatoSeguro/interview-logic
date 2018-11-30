#!/usr/bin/python3
from math import sqrt

def isPrimo(n):
    """Retorna True se o numero for primo, senão False
    >>> isPrimo(2)
    True
    >>> isPrimo(10)
    False
    """
    for i in range(2, int(sqrt(n)) + 1):
        if(n % i == 0):
            return False
    return True

def MMCSequencia(n):
    """Retorna o MMC de uma sequencia de numeros naturais começando por 1
    A sequencia começa em 1 e vai até o parametro n
    >>> MMCSequencia(10)
    2520
    """
    primos = [i for i in range(2, n + 1) if isPrimo(i) == True]
    total = 1
    for p in primos:
        produto_maximo = p
        while(produto_maximo * p < n):
            produto_maximo = produto_maximo * p
        total = total * produto_maximo
    return total

if __name__ == "__main__":
    print(MMCSequencia(20))
