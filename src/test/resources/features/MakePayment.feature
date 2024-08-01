Feature: Verificar balance en Eribank

  Background:
    Given que Christian desea iniciar sesion en la aplicacion Eribank con el usuario "company" y contraseña "company"

  @MakePayment
  Scenario Outline:Seleccionar Paises en Make Payment
    When Christian desea realizar un pago
      | phone   | name   | amount   | country   |
      | <phone> | <name> | <amount> | <country> |
    Then visualiza la pantalla de saldo con el mensaje Your balance
    Examples:
      | phone    | name | amount | country    |
      | 23456787 | user | 5      | Iceland    |
      | 23456787 | user | 6      | Bangladesh |
      | 23456787 | user | 5      | Ethiopia   |

  @Mortage
  Scenario Outline:Diligenciar MortageRequest
    When Christian desea realizar una solicitud de hipoteca
      | firstName   | lastName   | age   | address1  | address2  | country   | typeLoan   | numberOfYears   | typeOfOccupation   | yearlyIncome   |
      | <firstName> | <lastName> | <age> | <addres1> | <addres2> | <country> | <typeLoan> | <numberOfYears> | <typeOfOccupation> | <yearlyIncome> |
    Then visualiza la pantalla de saldo con el mensaje Your balance
    Examples:
      | firstName | lastName | age | addres1 | addres2 | country   | typeLoan | numberOfYears | typeOfOccupation | yearlyIncome |
      | firstname | lastname | 30  | addres1 | addres2 | USA       | Car      | 10            | Private Job      | 2,000,000    |
      | firstname | lastname | 30  | addres1 | addres2 | Argentina | Car      | 10            | Private Job      | 2,000,000    |



