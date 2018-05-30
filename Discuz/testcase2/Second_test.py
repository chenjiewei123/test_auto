from unittest import TestCase
from Page2 import Page_login
from Page2 import Page_pufa
from Page2 import Page_puhui
from Page2 import Page_Alogin
from Page2 import Page_delete
from Page2 import Page_create
from Page2 import Page_loginout
import time
class Second_test(TestCase):
    def test_second(self):
        Page_Alogin.test_discuz_Alogin('admin','admin')
        time.sleep(3)
        Page_delete.test_discuz_delete()
        Page_create.test_discuz_create('admin','新版块')
        time.sleep(3)
        Page_login.test_discuz_login('cjw','password')
        time.sleep(3)
        Page_pufa.page_discuz_pu('haotest2', 'hello')
        time.sleep(3)
        Page_puhui.page_discuz_puhui('hellolllllll')
        Page_loginout.test_discuz_loginout()
