# Maco Wins

Entrega individual para TP Macowin.

## Alumno   

- `Nombre`: Ciro Martin
- `Legajo`: 138162-3
- `Curso`: K3153
- `Fecha Entrega`: 01/04/2025

## Estructura del Proyecto

- `src/main/macowin/domain`: Contiene las clases principales del dominio.
- `src/models/macowin.puml`: Diagrama UML.

## Configuración del Proyecto

El proyecto utiliza IntelliJ IDEA como entorno de desarrollo integrado (IDE).



## Identificar Requerimientos

#### Tipos de Prenda  

Prendas solicitadas:

- `saco`
- `pantalon`
- `camisa`

#### Cálculo de Precio de la Prenda

El precio de una prenda depende de su estado:

- `Nueva`: No modifica el precio base.
- `Promoción`: Se resta un valor fijo definido por el usuario.
- `Liquidación`: Se calcula el 50% del precio base.

#### Registro de Ventas

- Registrar las `prendas vendidas`, su `cantidad` y la `fecha de venta`.

- Recargo al importe final segun medio de pago:
  - `Efectivo`: No modifica el precio de la venta.
  - `Tarjeta Débito`: No modifica el precio de la venta.
  - `Tarjeta Crédito`: Tiene un recargo adicional:
    - `Fórmula`: (cantidad de cuotas * coeficiente fijo) + (0.01 * precio de cada prenda).

#### Cálculo de Ganancias

- Calcular las `ganancias totales` de un `día específico` en base a las ventas registradas.

