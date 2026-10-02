1.record o clase. ¿Cuáles de estos tipos son inmutables por naturaleza y cuáles necesitarán mutabilidad más adelante? Ten en cuenta que en la UD4 JPA exige constructor sin argumentos y campos mutables: ¿afecta eso a la decisión de ahora?

Coordenadas,DireccionPostal y Matricula son record porque son inmutables ya que si le cambiamos o quitamos cualquier numero ya estariamos hablando de otra Coordenada,DireccionPostal o Matricula.


2.BigDecimal, nunca double. Explica por qué en el ADR.

porque BigDecimal guarda el numero exactamente como lo guardaste.


3.LocalDate frente a LocalDateTime: ¿cuál para la fecha de comisión de la infracción? ¿Y para el plazo de pronto pago?

LocalDateTime porque  te dice la hora que se cometio la infraccion y para el pronto pago LocalDate porque solo nos interesa el dia


4.¿Matricula debe ser un tipo propio o basta con un String? Argumenta.

Lo puse como un tipo unico ya que lo puse como record al tratarse de un dato inmutable


5.¿Qué campos pueden ser null legítimamente? Recuerda que Denuncia.conductor lo es cuando la capta un radar.

    - conductorId: lo mismo que con Denuncia.conductor
    - PermisoConducir.fechaRenovacion: nunca se ha renovado pues no hay fecha de renovacion
    - Expediente.fechaResolucion: todavia no se ha resuelto
    - Resolucion.fechaResolucion: todavia no se ha resuelto
    - Titularidad.fechaBaja: si el titular sigue estando de alta
    - Notificacion.acuse: si el intento de notifcacion sigue en PENDIENTE
