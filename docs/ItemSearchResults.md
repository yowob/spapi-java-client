# ItemSearchResults

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**numberOfResults** | **Integer** | The estimated total number of products matched by the search query (only results up to the page count limit will be returned per request regardless of the number found).  Note: The maximum number of items (ASINs) that can be returned and paged through is 1000. | 
**pagination** | [**Pagination**](Pagination.md) |  | 
**refinements** | [**Refinements**](Refinements.md) |  | 
**items** | [**List&lt;Item&gt;**](Item.md) | A list of items from the Amazon catalog. | 
