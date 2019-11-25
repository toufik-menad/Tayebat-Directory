echo "############### Fetching tar file ######################################"
wget "https://static.openfoodfacts.org/data/openfoodfacts-mongodbdump.tar.gz"

echo "############### Uncompressing the tar file ###############"
tar xvzf openfoodfacts-mongodbdump.tar.gz

echo "############### Restore database from dump file ###############"
$mongorestore -d NEW_FOOD -c PRODUCTS /dump/off/products.bson


echo "############### Remove dir: dump ###############"
rm -r dump


echo "############### Export product codes form MongoDB ###############"
mongoexport --host localhost --db <db_name> --collection <collection_name> --type=csv --out <file name>.csv --fields _id

echo "############### Runnig the jar file with external properties file ###############"