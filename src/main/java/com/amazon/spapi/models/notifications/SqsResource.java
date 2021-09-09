package com.amazon.spapi.models.notifications;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.Objects;

/**
 * The information required to create an Amazon Simple Queue Service (Amazon SQS) queue destination.
 */
@Schema(description = "The information required to create an Amazon Simple Queue Service (Amazon SQS) queue destination.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-09-01T00:00:00.000+08:00[Asia/Shanghai]")
public class SqsResource {
    @SerializedName("arn")
    private String arn = null;

    public SqsResource arn(String arn) {
        this.arn = arn;
        return this;
    }

    /**
     * The Amazon Resource Name (ARN) associated with the SQS queue.
     *
     * @return arn
     **/
    @Schema(required = true, description = "The Amazon Resource Name (ARN) associated with the SQS queue.")
    public String getArn() {
        return arn;
    }

    public void setArn(String arn) {
        this.arn = arn;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SqsResource sqsResource = (SqsResource) o;
        return Objects.equals(this.arn, sqsResource.arn);
    }

    @Override
    public int hashCode() {
        return Objects.hash(arn);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SqsResource {\n");
        sb.append("    arn: ").append(toIndentedString(arn)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }
}
