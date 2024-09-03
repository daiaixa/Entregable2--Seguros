SEGUROS

Se requiere modelar una empresa de seguros que cuenta con una diversidad de pólizas
(seguros) que brinda a sus clientes.

Es importante para la empresa mantener un alto grado de calidad en todos los servicios que
brinda y mantener una comunicación estrecha con sus clientes.

Un cliente puede adquirir cualquiera de las pólizas que ofrece la empresa. Para poder identificar
cada póliza, cada vez que un vendedor registra una nueva póliza, la empresa le asigna un
número único. De cada póliza se debe definir una suma asegurada (que es el importe por el
cual se está asegurando) y el beneficiario (que puede ser el mismo cliente u otra persona) al
cual se le debe abonar la suma asegurada de ser necesario.
Todas las pólizas que ofrece la empresa deben ser abonadas en forma mensual por sus
clientes. El importe de dicha cuota y suma asegurada dependen del tipo de póliza que se esté
contratando.

De los beneficiarios se desea conocer el apellido, nombre, número de documento. Y de los
clientes se desea conocer el apellido, nombre, número de documento y edad.
Cada vez que la empresa registra un cliente nuevo, le asigna un número único y secuencial.
La empresa cuenta con los siguientes tipos de pólizas:

    ● Vida: En los seguros de vida, la suma asegurada es igual a 20 sueldos del cliente, y la cuota mensual es igual al 1% del sueldo declarado. Para los clientes mayores a 60 años se debe incrementar un valor fijo en la cuota mensual, este valor es el mismo para todas las pólizas de este tipo.

    ● Para bienes inmuebles: La suma asegurada en los inmuebles (casas, terrenos, campos, etc.) está definida por un importe fijo por metro cuadrado de la propiedad, y la cuota mensual es igual al 0.2% de la suma asegurada más un gasto administrativo que es igual para todas las pólizas de este tipo.

    ● Para bienes muebles: La suma asegurada en los bienes muebles (cualquier producto que se quiere asegurar, ejemplo una computadora, un televisor, un equipo de música, etc.) está definida por el valor del producto asegurado declarado por el cliente, y la cuota mensual será igual al valor de la suma asegurada prorrateada en 8 años (es decir dividida en 96 meses).

    ● Para vehículos: Los vehículos, son un caso particular de los bienes muebles, en donde además se desea conocer la marca y modelo (año de patentamiento). En este caso la cuota mensual será igual que para los bienes muebles menos un 2% por año de antigüedad del vehículo.

Se requiere implementar:

Todas las clases necesarias para poder realizar la liquidación mensual de las cuotas de las
pólizas que la empresa posee.

    ● Un constructor como mínimo (con al menos un parámetro) para cada clase implementada.

    ● Métodos para modificación y consulta (set/get) de los atributos que sean necesarios (tener en cuenta los atributos que puedan ser de solo lectura).

    ● Método equals de la clase Cliente, que retorna true si dos clientes poseen el mismo número de documento.
    
    ● Método toString de la clase cliente que retorna el número de cliente, apellido y documento separados por guiones. Realice un programa de prueba que cree:
    
    ● La empresa aseguradora.
    
    ● Al menos 3 clientes distintos.
    
    ● Al menos una póliza de cada tipo.

Y realice la liquidación mensual de las cuotas de todas las pólizas de la empresa mostrando un
listado por consola. El listado debe tener los datos para identificar al cliente, numero de póliza,
suma asegurada y cuota calculada. Al final debe imprimir el importe total que debería recaudar
la empresa. 
