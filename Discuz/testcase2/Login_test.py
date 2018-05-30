from unittest import TestCase
from Page2 import Page_login
from Page2 import Page_fatie
from Page2 import Page_huitie
from Page2 import Page_loginout
import time

class login_post(TestCase):

    def test_login(self):
        Page_login.test_discuz_login('cjw','password')
        time.sleep(3)
        Page_fatie.page_discuz_fatie('haotest','浩特斯特')
        Page_huitie.page_discuz_huitie('hello')
        Page_loginout.test_discuz_loginout()


