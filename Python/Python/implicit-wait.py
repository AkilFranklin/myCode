from selenium import webdriver
driver=webdriver.Firefox()
driver.implicitly_wait(15)
driver.get("http://google.com")
search_field = driver.find_element_by_css_selector("input[name=d]") #will search for the element for the time given. and then return an error
driver.quit()