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
        self.driver.find_element(*LoginPageLocators.MAIN_DIV).isdisplayed()

    def sign_in_disp(self,user):
        self.driver.find_element(*LoginPageLocators.SIGN_IN_DIV).isdisplayed()

    def right_div(self,user):
        self.driver.find_element(*LoginPageLocators.LEFT_DIV).isdisplayed()


