(ns logic.customer-validation-test
  (:require [clojure.test :refer :all]
            [logic.customer :refer [validate-customer]]))

(deftest validate-customer-test
  (testing "Order Entry System"
    (testing "customer invalid when credit-limit above of 50000"
      (is (= (validate-customer {:id           "1234567"
                                 :name         "customer name"
                                 :address      "customer address"
                                 :credit-limit "55000"})
             :invalid)))))
