from util2.seleniumUtil import getDriver
def page_discuz_puhui(body):

    huitie_click_tie=getDriver.driver.find_element_by_link_text('chenjiewei1')
    huitie_click_tie.click()
    huitie_input_body=getDriver.driver.find_element_by_id('fastpostmessage')
    huitie_input_body.send_keys(body)
    huitie_click_hui=getDriver.driver.find_element_by_xpath('//*[@id="fastpostsubmit"]')
    huitie_click_hui.click()