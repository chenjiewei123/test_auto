import time
from unittest import TestCase
from Page2 import Page_toupiao
from Page2 import Page_login
from Page2 import Page_loginout


class toupiao_test(TestCase):
    def test_toupiao(self):
        Page_login.test_discuz_login('cjw','password')
        time.sleep(3)
        Page_toupiao.test_discuz_toupiao('谁是天下第一','你','我','他')
        Page_loginout.test_discuz_loginout()
