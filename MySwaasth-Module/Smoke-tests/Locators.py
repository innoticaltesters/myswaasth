from selenium.webdriver.common.by import By

class LoginPageLocators(object):
    MAIN_DIV =            (By.CLASS_NAME,'ui-g-12')
    TEST_DIV =            (By.CSS_SELECTOR,'ul.text-center > li:nth-child(1)')
    EX=                   (By.XPATH,'html/body/app-root/div/home/div/div/nav/ul/li[1]')
    SIGN_IN_DIV =         (By.CSS_SELECTOR,'div.ui-g-12.panel')
    LEFT_DIV =            (By.CSS_SELECTOR,"div.ui-g-12.right-panel")






