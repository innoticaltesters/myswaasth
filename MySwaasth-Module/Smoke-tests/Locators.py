from selenium.webdriver.common.by import By

class LoginPageLocators(object):
    MAIN_DIV =            (By.XPATH,"//div[@class='content-wrapper']")
    SIGN_IN_DIV =         (By.CSS_SELECTOR,'div.ui-g-12.panel')
    LEFT_DIV =            (By.CSS_SELECTOR,"div.ui-g-12.right-panel")
    PAGE_TITLE=           (By.XPATH,"//div[@class='ui-g-12']/h2")






