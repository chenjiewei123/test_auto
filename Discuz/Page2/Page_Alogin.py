from util2.seleniumUtil import getDriver

def test_discuz_Alogin(username,password):
        getDriver.driver.implicitly_wait(5)
        getDriver.driver.get('http://127.0.0.1:8088/discuz/forum.php')
        print('Discuz首页已打开',getDriver.driver.title)
        getDriver.driver.maximize_window()
        #查找登录框
        login_input_username=getDriver.driver.find_element_by_id('ls_username')
        login_input_username.send_keys(username)
        login_input_password=getDriver.driver.find_element_by_id('ls_password')
        login_input_password.send_keys(password)
        login_click_button=getDriver.driver.find_element_by_class_name('pn')
        login_click_button.click()
        print('登录成功')
