def test_cases(number):
    return testCases[number]


testCases = [
    # [severity, description]
    ['Blocker','Check for page loaded -check for page title'],
    ['Blocker','Check for the main div to be loaded'],
    ['Blocker', 'Check for sign in div'],
    ['Blocker', 'Check for right panel div'],
    ['Blocker', 'Check page returned http status code 200'],
    ['Blocker', 'Check page doesn"t returned http status code 404'],
]