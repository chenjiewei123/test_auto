from util2.seleniumUtil import getDriver
import time
from selenium.webdriver.common.action_chains import ActionChains
def test_discuz_toupiao(ti,yi,er,san):
    fatie_click_mo = getDriver.driver.find_element_by_link_text('默认版块')
    print(fatie_click_mo.text)
    fatie_click_mo.click()
    print('点击默认板块')
    toupiao_on_mouse=getDriver.driver.find_element_by_id('newspecial')
    print('鼠标移动到发帖按钮')
    time.sleep(5)
    ActionChains(getDriver.driver).move_to_element(toupiao_on_mouse).perform()
    toupiao_click_tou=getDriver.driver.find_element_by_link_text('发起投票')
    toupiao_click_tou.click()
    toupiao_input_ming=getDriver.driver.find_element_by_id('subject')
    toupiao_input_ming.send_keys(ti)
    toupiao_input_yi=getDriver.driver.find_element_by_xpath('//*[@id="pollm_c_1"]/p[1]/input')
    toupiao_input_yi.send_keys(yi)
    toupiao_input_er=getDriver.driver.find_element_by_xpath('//*[@id="pollm_c_1"]/p[2]/input')
    toupiao_input_er.send_keys(er)
    toupiao_input_san=getDriver.driver.find_element_by_xpath('//*[@id="pollm_c_1"]/p[3]/input')
    toupiao_input_san.send_keys(san)
    toupiao_click_tijiao=getDriver.driver.find_element_by_id('postsubmit')
    toupiao_click_tijiao.click()
    toupiao_click_xuan=getDriver.driver.find_element_by_id('option_1')
    toupiao_click_xuan.click()
    toupiao_click_tixuan=getDriver.driver.find_element_by_id('pollsubmit')
    toupiao_click_tixuan.click()
