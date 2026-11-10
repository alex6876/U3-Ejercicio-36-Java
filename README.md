Aquí tienes la estructura en formato Markdown lista para el `README.md` de este código de **Simulación de Flota de Vehículos de Emergencia (Herencia, Sobrescritura y Polimorfismo en Java)**, manteniendo el enfoque exclusivo de **Programación Orientada a Objetos en memoria** (sin bases de datos):

---

# 🚑 Simulación de Flota de Vehículos de Emergencia (Herencia y Polimorfismo en Java)

Este proyecto es una aplicación en Java que modela un sistema de gestión y despacho para una central de emergencias, implementando una jerarquía de clases mediante herencia para administrar distintos tipos de unidades operativas (ambulancias, camiones de bomberos y patrullas policiales) con protocolos de alerta y activación especializados. Pone en práctica conceptos fundamentales de la **Programación Orientada a Objetos (POO)** como la **generalización de atributos protegidos (`protected`)**, la reutilización de constructores mediante `super`, la sobrescritura polimórfica de métodos (`@Override`), la invocación dinámica de comportamientos y el procesamiento masivo mediante arreglos polimórficos en memoria.

---

## 🧩 Clases y Estructura del Sistema

El diseño del software se organiza a través de una clase base general, sus respectivas subclases especializadas y un punto de ejecución:

* **`VehiculoEmergencia`**: Clase base que centraliza los atributos y comportamientos comunes de cualquier unidad de respuesta rápida.
* **Atributos protegidos (`protected`)**: `patente`, `estacionBase` y `enServicio`, permitiendo que las clases hijas accedan directamente a la identidad y estado operativo del vehículo.
* **Constructor**: Inicializa los datos comunes de identificación y configura el estado inicial en fuera de servicio (`false`).
* **Métodos operativos**:
* `activarAlerta()`: Comportamiento base que emite una señal genérica de emergencia, diseñado para ser sobrescrito por las subclases.
* `despachar()`: Valida si la unidad no se encuentra en servicio, actualiza su estado a activo (`true`), emite el mensaje de despacho e invoca de forma polimórfica al método `activarAlerta()`.
* `mostrar()`: Imprime de forma estructurada los datos generales de la unidad y su disponibilidad.




* **`Ambulancia`**: Extiende de `VehiculoEmergencia` para modelar unidades sanitarias de asistencia médica.
* **Atributos privados (`private`)**: `stockOxigeno` (en litros) y `medicosAbordo`.
* **Constructor**: Invoca a `super(...)` para inicializar los datos heredados y configura las especificaciones médicas.
* **Sobrescritura (`@Override`)**:
* `activarAlerta()`: Personaliza la sirena médica y el mensaje de operativo sanitario.
* `mostrar()`: Reutiliza `super.mostrar()` y detalla el stock de oxígeno y el personal médico a bordo.




* **`CamionBomberos`**: Extiende de `VehiculoEmergencia` para modelar unidades de rescate y extinción de incendios.
* **Atributos privados (`private`)**: `capacidadAguaLitros` y `longitudEscala`.
* **Constructor**: Utiliza `super(...)` para asignar los atributos heredados y configura la capacidad hídrica y de escala.
* **Sobrescritura (`@Override`)**:
* `activarAlerta()`: Define la sirena específica para bomberos y el protocolo de respuesta contra incendios.
* `mostrar()`: Muestra los datos base mediante `super`, añadiendo la capacidad de agua y la longitud de la escala.




* **`PatrullaPolicial`**: Extiende de `VehiculoEmergencia` para modelar unidades de seguridad urbana e intervención táctica.
* **Atributos privados (`private`)**: `cantidadEfectivos` y `blindaje`.
* **Constructor**: Utiliza `super(...)` para configurar las propiedades heredadas y los recursos humanos y defensivos.
* **Sobrescritura (`@Override`)**:
* `activarAlerta()`: Activa las balizas policiales y el protocolo de intervención táctica.
* `mostrar()`: Reutiliza la lógica base e incorpora la dotación de efectivos y la disponibilidad de blindaje.




* **`Main`**: Punto de entrada del programa. Instancia una ambulancia, un camión de bomberos y una patrulla policial con sus parámetros específicos, los agrupa en un arreglo polimórfico de tipo `VehiculoEmergencia[]`, y recorre la flota simulando el reporte de estado y el despacho operativo de cada unidad por consola.

---

## ⚙️ Reglas de Negocio y Control de Validación

1. **Control de Estado de Servicio:** El método `despachar()` implementa una validación defensiva que impide despachar unidades que ya se encuentran activas en el terreno, informando el estado por consola.
2. **Polimorfismo en las Alertas:** Gracias a la ligadura dinámica, al invocar `despachar()` (que a su vez llama internamente a `activarAlerta()`), Java ejecuta automáticamente el tipo exacto de sirena y protocolo correspondiente a cada subclase (médica, bomberos o policial).
3. **Reutilización Estructural con `super`:** Las subclases delegan la visualización de los datos básicos y la inicialización de atributos a la superclase mediante llamadas a `super`, manteniendo un diseño limpio y modular.

---

## 💻 Salida por Consola

Al ejecutar la clase `Main`, el programa genera el siguiente resultado:

```text
===== CENTRAL DE EMERGENCIAS =====

------------------------------
Patente: AB123CD
EstacionBase: Hospital Central
En Servicio?: false

Despachando unidad...
Despachando vehiculo emergencia.
¡SIRENA MEDICA ACTIVADA!
Operativo: asistencia sanitaria de emergencia.

------------------------------
Patente: EF456GH
EstacionBase: Cuartel Norte
En Servicio?: false

Despachando unidad...
Despachando vehiculo emergencia.
SIRENA DE BOMBEROS ACTIVADA.
Operativo: respuesta ante incendio.

------------------------------
Patente: IJ789KL
EstacionBase: Comisaria Primera
En Servicio?: false

Despachando unidad...
Despachando vehiculo emergencia.
BALIZAS POLICIALES ACTIVADAS.
Operativo: intervencion policial.

```

---

## 🚀 Conceptos de Programación Aplicados

* **Jerarquía de Operaciones de Emergencia:** Modelado de flotas vehiculares mediante una estructura robusta de herencia orientada a objetos.
* **Polimorfismo y Ligadura Dinámica:** Ejecución transparente de comportamientos especializados (`activarAlerta`) a través de referencias genéricas de la clase base.
* **Diseño Modular y Encapsulamiento:** Protección de estados operativos y atributos específicos mediante modificadores de acceso, separando la lógica de negocio de la ejecución en el cliente (`Main`).
