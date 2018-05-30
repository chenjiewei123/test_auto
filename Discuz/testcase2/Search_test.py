import time
from unittest import TestCase
from Page2 import Page_login
from Page2 import Page_search
from Page2 import Page_loginout
class search_test(TestCase):
    def test_search(self):
        Page_login.test_discuz_login('cjw', 'password')
        time.sleep(5)
        Page_search.test_discuz_search('haotest')
        time.sleep(5)
        Page_loginout.test_discuz_loginout()