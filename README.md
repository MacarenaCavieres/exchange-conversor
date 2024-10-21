# Conversor de Monedas

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white)

## Descripción

El **Conversor de Monedas** es una aplicación Java que permite convertir entre diferentes 
monedas utilizando la API de [ExchangeRate-API](https://www.exchangerate-api.com). Los usuarios pueden elegir entre varias opciones de conversión como Dólar a Peso Argentino, Real Brasileño a Dólar, entre otros.

## Características

- Conversión de diferentes monedas:
    - Dólar => Peso Argentino
    - Peso Argentino => Dólar
    - Dólar => Real Brasileño
    - Real Brasileño => Dólar
    - Dólar => Peso Colombiano
    - Peso Colombiano => Dólar
- Usa una API externa para obtener las tasas de conversión.
- Diseño interactivo con menús sencillos para seleccionar opciones.

## Requisitos Previos

Asegúrate de tener lo siguiente instalado en tu máquina:

- [Java 11+](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html)

## Instalación

1. **Clonar el repositorio**:

   ```bash
   git clone https://github.com/MacarenaCavieres/exchange-conversor
   cd exchange-conversor
   ```
## Uso
1. Ejecuta la aplicación desde tu IDE o línea de comandos.

2. Aparecerá un menú interactivo que permite seleccionar las diferentes opciones de conversión de moneda.

3. Elige una opción y la cantidad a convertir, y el sistema te mostrará el resultado de la conversión.

## Ejemplo de USO
```bash
*************************************************
Sea bienveid@ al Conversor de Moneda
1.- Dólar =>> Peso Argentino
2.- Peso Argentino =>> Dólar
3.- Dólar =>> Real Brasileño
4.- Real Brasileño =>> Dólar
5.- Dólar =>> Peso Colombiano
6.- Peso Colombiano =>> Dólar
7.- Salir
Elija una opción válida
*************************************************
Opción: 1
Elija el valor que desea convertir: 100
```
 ### Resultado
````bash
100 USD son aproximadamente 20,000 ARS
````

## API
Este proyecto usa la [ExchangeRate-API](https://www.exchangerate-api.com) para obtener las tasas de conversión.

### Explicación de las secciones:

- **Descripción**: Describe brevemente lo que hace tu proyecto.
- **Características**: Resalta las principales funciones de tu aplicación.
- **Instalación**: Explica cómo clonar el proyecto y configurarlo.
- **Uso**: Instrucciones básicas sobre cómo ejecutar la aplicación y usarla.
- **Ejemplo de Uso**: Un ejemplo del menú y las conversiones.
- **Dependencias**: Enumera las bibliotecas que estás usando, como `Gson`.
- **API**: Describe la API externa que usas.
