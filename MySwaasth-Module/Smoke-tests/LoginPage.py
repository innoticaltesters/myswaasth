from selenium import webdriver
from selenium.webdriver.common.keys import Keys
from .base import Page
from .Locators import *
import Users
from selenium.webdriver.support.ui import WebDriverWait
from selenium.webdriver.support import expected_conditions as EC
import time
import requests


class LoginPage(Page):
    def page_is_loaded(self,user):
        self.driver.find_element(*LoginPageLocators.EX)

    def sign_in_disp(self,user):
        self.driver.find_element(*LoginPageLocators.SIGN_IN_DIV)

    def right_div(self,user):
        self.driver.find_element(*LoginPageLocators.LEFT_DIV)

    def get_http_code(self,user):
        r= requests.get("")
        return r.status_code

    def get_get_headers(self,user):
        r1= requests.get("")
        return r1.headers['contexnt-type']

    def get_encoding(self,user):
        r2= requests.get("")


class HomePage(Page):
    pass


