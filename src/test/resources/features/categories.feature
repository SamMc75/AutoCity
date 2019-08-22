Feature: Start Testing

  @1
  Scenario: Проверка попадания на страницу категории Пицца
    Given I open citypizza.ru
    When I click on City button
    Then I select category "Пицца"
