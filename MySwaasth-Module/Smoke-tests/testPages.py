import unittest
from selenium import webdriver
from .LoginPage import *
from .testCases import test_cases
from Locators import *
from selenium.webdriver.common.by import By
import time

desired_caps ={
    'platform':'macOS 10.12',
    'browserName':'chrome',
    'version':'latest'
}

class TestPages(unittest.TestCase):
    def setUp(self):
        self.driver = webdriver.Remote(
            command_executor='http://rahulyadav:599a40cd-73f3-420f-90da-6cac1374a058@ondemand.saucelabs.com:80/wd/hub',
            desired_capabilities=desired_caps
        )
    def test_start(self):
        driver = self.driver
        driver.get('http://myswaasth.sia.co.in/#/home/login')

    def check_page_title(self,user):
        print("\n"+str(test_cases(0)))
        mainPage=LoginPage(self.driver)
        check_page_title=mainPage.page_title("page_title")
        self.assertEqual("Myswaasth",check_page_title)

    def check_main_div_loaded(self,user):
        print("\n"+str(test_cases(1)))
        mainPage=LoginPage(self.driver)
        check_base_div_loaded=mainPage.main_div_is_loaded("main_div_loaded")
        if(check_base_div_loaded.isdisplayed()):
            print("Main Page Div is loaded")
        else:
            print("Main Div is not loaded")

    def check_login_div_is_displayed(self,user):
        print("\n"+str(test_cases(2)))
        mainPage= LoginPage(self.driver)
        check_sign_in_div = mainPage.right_div("sign_in_div")
        if(check_sign_in_div.isdisplayed()):
            print("Sign in div is displayed")
            self.driver.get_screenshot_as_file("Passed_test.png")
        else:
            self.driver.get_screenshot_as_file('Failed_sign_in_div_saucelabs.png')
            print("Test Failed")




    def tearDown(self):
        self.driver.quit()

if __name__=="__main__":
    suite = unittest.TestLoader().loadTestsFromTestCase(TestPages)
    unittest.TextTestRunner(verbosity=2).run(suite)


