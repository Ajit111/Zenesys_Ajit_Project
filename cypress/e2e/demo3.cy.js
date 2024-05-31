describe('template spec', () => {
  it('passes', () => {
    cy.visit('https://www.saucedemo.com/');
    cy.get('#user-name').type('standard_user');
    cy.wait(5000);

    cy.get('#password').type('secret_sauce');
    cy.wait(4000);
    cy.get('#login-button').click();
    cy.wait(9000);
    


  })
})