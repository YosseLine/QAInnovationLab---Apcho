#language: es
@testfeature
Característica: Validar precio
  Yo, como usuario
  Quiero, ingresar a la web
  loguearme, navegar, elegir

  @validarPrecio
  Esquema del escenario: Validación del precio de un producto
    Dado estoy en la página de la tienda
    Y me logueo con mi usuario "<user>" y clave "<password>"
    Cuando navego a la categoria "<category>" y subcategoria "<subCategory>"
    Y agrego <qty> unidades del primer producto al carrito
    Entonces valido en el popup la confirmación del producto agregado
    Y valido en el popup que el monto total sea calculado correctamente
    Cuando finalizo la compra
    Entonces valido el titulo de la pagina del carrito
    Y vuelvo a validar el calculo de precios en el carrito
  Ejemplos:
    | user                 | password    | category | subCategory | qty |
    | diego@gmail.com      | pickme05*Up | CLOTHES  | MEN         | 2   |
    | tepphy_fail@mail.com | 123456      | CLOTHES  | WOMEN       | 1   |
    | diego@gmail.com      | pickme05*Up | CLOTHES  | MEN         | 2   |