class Date:
    def _init_(self, year, month = "Jan", Day = 1):
        self.result = "{:02}-{}-{:04}".format(Day, month, year)
        
    def _str_(self):
        return self.result