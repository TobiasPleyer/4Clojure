;; Filter Perfect Squares - http://www.4clojure.com/problem/74
(fn [s]
  (let [perfect-square? (fn [n]
                          (let [sq (Math/floor (Math/sqrt n))]
                            (= (float n) (* sq sq))))
        str2ints #(map read-string (clojure.string/split % #"\s*,\s*"))
        ints2str #(interpose "," (map str %))]
    (->> s
         str2ints
         (filter perfect-square?)
         ints2str
         (apply str))))
