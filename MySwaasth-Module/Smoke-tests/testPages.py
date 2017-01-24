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

    def test_page_loaded(self):
        print('\n'+str(test_cases(0)))
        myPage = LoginPage(self.driver)
        base_div = myPage.page_is_loaded('loading_page')
        time.sleep(10)
        if (base_div.isdisplayed()):
            print('Base div is displayed')

        else:
            print("Base div is not displayed")


    def tearDown(self):
        self.driver.quit()

if __name__=="__main__":
    suite = unittest.TestLoader().loadTestsFromTestCase(TestPages)
    unittest.TextTestRunner(verbosity=2).run(suite)


