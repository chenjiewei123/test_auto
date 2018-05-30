from util2.seleniumUtil import getDriver
import time

def page_discuz_pu(ti,body):
    time.sleep(3)
    fatie_click_mo=getDriver.driver.find_element_by_link_text('123')
    print(fatie_click_mo.text)
    fatie_click_mo.click()
    print('新版块')

    time.sleep(3)
    fatie_input_ti = getDriver.driver.find_element_by_id('subject')
    fatie_input_ti.send_keys(ti)
    print('输入标题')
    fatie_input_body = getDriver.driver.find_element_by_id('fastpostmessage')
    fatie_input_body.send_keys(body)
    fatie_click_fa = getDriver.driver.find_element_by_id('fastpostsubmit')
    fatie_click_fa.click()
    print('发帖成功')