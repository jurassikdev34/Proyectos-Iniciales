from selenium import webdriver
import time
 
web = webdriver.Chrome()
web.get('http://instagram.com')
time.sleep(5)
 
 
def login():
    user = "user"
    paswd = "password"
    acceptCookies = web.find_element_by_xpath("/html/body/div[5]/div[1]/div/div[2]/div/div/div/div/div[2]/div/button[2]").click()
    time.sleep(5)
    inputUser = web.find_element_by_xpath(
        "/html/body/div[1]/section/main/article/div[2]/div[1]/div/form/div/div[1]/div/label/input")
    inputUser.send_keys(user)
    inputPass = web.find_element_by_xpath(
        "/html/body/div[1]/section/main/article/div[2]/div[1]/div/form/div/div[2]/div/label/input")
    inputPass.send_keys(paswd)
    loginButton = web.find_element_by_xpath(
        "/html/body/div[1]/section/main/article/div[2]/div[1]/div/form/div/div[3]").click()
 
 
def open_followers(account_instagram):
    web.get("https://www.instagram.com/" + account_instagram + "/followers/")
    time.sleep(5)
    web.find_element_by_xpath("/html/body/div[1]/section/main/div/header/section/ul/li[2]/a").click()
 
 
def scroll_followers(minutes):
    pop_up_window = web.find_element_by_xpath("/html/body/div[6]/div/div/div[2]")


    timeout = time.time() + 60 * minutes
    while True:
        if time.time() > timeout:
            break
        web.execute_script(
            'arguments[0].scrollTop = arguments[0].scrollTop + arguments[0].offsetHeight;',
            pop_up_window)
        time.sleep(1)
 
 
def follow_followers():
    list_followers = web.find_element_by_xpath("/html/body/div[6]/div/div/div[2]/ul")
    for child in list_followers.find_elements_by_css_selector("li"):
        user_name = child.find_element_by_css_selector(".notranslate").text
        follow_button = child.find_element_by_css_selector("button")
        print(user_name)
        print("----")
        print(follow_button.text)
        if "Seguir" == follow_button.text:
            follow_button.click()
            print(user_name + "seguido")
        else:
            print("Ya lo sigues")
        time.sleep(1)
 
 
sources = ["vox_es"]
login(4)
time.sleep(5)

for account in sources:
    open_followers(account)
    time.sleep(5)
    scroll_followers(2)
    follow_followers()
 
 