from util2.seleniumUtil import getDriver
def test_discuz_delete():
    fatie_click_mo = getDriver.driver.find_element_by_link_text('默认版块')
    print(fatie_click_mo.text)
    fatie_click_mo.click()
    print('点击默认板块')
    delete_click_xuan=getDriver.driver.find_element_by_name('moderate[]')
    delete_click_xuan.click()
    print('选中删除项')
    delete_click_delete=getDriver.driver.find_element_by_link_text('删除')
    delete_click_delete.click()
    print('点击删除')
    delete_click_que=getDriver.driver.find_element_by_xpath('//*[@id="modsubmit"]')
    delete_click_que.click()
    print('点击确定')