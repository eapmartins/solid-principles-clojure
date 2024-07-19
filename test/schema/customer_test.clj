(ns schema.customer-test
  (:require [clojure.test :refer :all]
            [schema.customer :refer [parse-customer]]))

(deftest parse-customer-test
  (testing "Order Entry System"
    (testing "parses a valid customer"
      (is (= (parse-customer ["Customer-id: 1234567"
                              "Name: customer name"
                              "Address: customer address"
                              "Credit limit: 50000"])
             {:id           "1234567"
              :name         "customer name"
              :address      "customer address"
              :credit-limit "50000"})))))
