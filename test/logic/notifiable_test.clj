(ns logic.notifiable-test
  (:require [clojure.test :refer :all]
            [logic.notifiable :refer [send-notification]])
  (:import [logic.notifiable EmailNotification]))

(deftest map->EmailNotification-test
  (testing "send notification"
    (testing "use email to send notification"
      (is (= {:status :sent}
             (send-notification (EmailNotification. "user@example.com"
                                                    "this is an email message")))))))
