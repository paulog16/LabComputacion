

class Coche:
    def __init__(self, marca, modelo, año):
        self.marca = marca
        self.modelo = modelo
        self.año = año
        self.estado = "Apagado"

    def encender(self):
        self.estado = "Encendido"
        print("El coche está encendido.")

    def apagar(self):
        self.estado = "Apagado"
        print("El coche está apagado.")

    def obtener_info(self):
        return f"Coche: {self.marca} {self.modelo} {self.año}. Estado: {self.estado}"

# Crear un objeto de la clase Coche
mi_coche = Coche("Toyota", "Corolla", 2022)

# Acceder a propiedades y métodos del objeto
print(mi_coche.obtener_info())  # Obtener información del coche
mi_coche.encender()             # Encender el coche
print(mi_coche.obtener_info())  # Obtener información actualizada
mi_coche.apagar()               # Apagar el coche
print(mi_coche.obtener_info())  # Obtener información actualizada

