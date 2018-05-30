from util2.seleniumUtil import getDriver
def test_discuz_search(test):
    getDriver.driver.implicitly_wait(5)
    search_input_sou=getDriver.driver.find_element_by_id('scbar_txt')
    search_input_sou.send_keys(test)
    print('输入搜索haotest')
    search_click_sou=getDriver.driver.find_element_by_name('searchsubmit')
    search_click_sou.click()
    print('点击搜索')
    getDriver.driver.switch_to.window(getDriver.driver.window_handles[1])
    search_click_tie=getDriver.driver.find_element_by_xpath('//*[@id="10"]/h3/a/strong/font').text
    #search_click_tie.click()
    #print('点击搜索的内容')
    #search_click_yan=getDriver.driver.find_element_by_id('thread_subject').text
    #验证搜索的帖子是否与预期一致
    print('判断搜索的结果是否与预期一致')
    assert search_click_tie == test

