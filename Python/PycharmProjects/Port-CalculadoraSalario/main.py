

HorasLunes1 = int(input("Digite las horas trabajadas el lunes de la primera semana: "))
HorasMartes1 = int(input("Digite las horas trabajadas el martes de la primera semana: "))
HorasMiercoles1 = int(input("Digite las horas trabajadas el miercoles de la primera semana: "))
HorasJueves1 = int(input("Digite las horas trabajadas el jueves de la primera semana: "))
HorasViernes1 = int(input("Digite las horas trabajadas el viernes de la primera semana: "))

HorasSemana1 = HorasLunes1 + HorasMartes1 + HorasMiercoles1 + HorasJueves1 + HorasViernes1

HorasLunes2 = int(input("Digite las horas trabajadas el lunes de la segunda semana: "))
HorasMartes2 = int(input("Digite las horas trabajadas el martes de la segunda semana: "))
HorasMiercoles2 = int(input("Digite las horas trabajadas el miercoles de la segunda semana: "))
HorasJueves2 = int(input("Digite las horas trabajadas el jueves de la segunda semana: "))
HorasViernes2 = int(input("Digite las horas trabajadas el viernes de la segunda semana: "))

HorasSemana2 = HorasLunes2 + HorasMartes2 + HorasMiercoles2 + HorasJueves2 + HorasViernes2

HorasLunes3 = int(input("Digite las horas trabajadas el lunes de la tercera semana: "))
HorasMartes3 = int(input("Digite las horas trabajadas el martes de la tercera semana: "))
HorasMiercoles3 = int(input("Digite las horas trabajadas el miercoles de la tercera semana: "))
HorasJueves3 = int(input("Digite las horas trabajadas el jueves de la tercera semana: "))
HorasViernes3 = int(input("Digite las horas trabajadas el viernes de la tercera semana: "))

HorasSemana3 = HorasLunes3 + HorasMartes3 + HorasMiercoles3 + HorasJueves3 + HorasViernes3

HorasLunes4 = int(input("Digite las horas trabajadas el lunes de la cuarta semana: "))
HorasMartes4 = int(input("Digite las horas trabajadas el martes de la cuarta semana: "))
HorasMiercoles4 = int(input("Digite las horas trabajadas el miercoles de la cuarta semana: "))
HorasJueves4 = int(input("Digite las horas trabajadas el jueves de la cuarta semana: "))
HorasViernes4 = int(input("Digite las horas trabajadas el viernes de la cuarta semana: "))

HorasSemana4 = HorasLunes4 + HorasMartes4 + HorasMiercoles4 + HorasJueves4 + HorasViernes4


HorasMensuales = HorasSemana1 + HorasSemana2 + HorasSemana3 + HorasSemana4

SalarioPorHora = int(input("Digite el salario por hora: "))

SalarioMensual = HorasMensuales * SalarioPorHora

print("Este mes ha trabajado: ")
print(HorasMensuales)

print("Por lo que expecta hacia un salario de: ")
print(SalarioMensual)