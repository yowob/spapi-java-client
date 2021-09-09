package com.amazon.spapi.models.messaging;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * GetMessagingActionsForOrderResponseLinks
 */
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-09-01T00:00:00.000+08:00[Asia/Shanghai]")
public class GetMessagingActionsForOrderResponseLinks {
    @SerializedName("self")
    private LinkObject self = null;
    @SerializedName("actions")
    private List<LinkObject> actions = new ArrayList<LinkObject>();

    public GetMessagingActionsForOrderResponseLinks self(LinkObject self) {
        this.self = self;
        return this;
    }

    /**
     * Get self
     *
     * @return self
     **/
    @Schema(required = true, description = "")
    public LinkObject getSelf() {
        return self;
    }

    public void setSelf(LinkObject self) {
        this.self = self;
    }

    public GetMessagingActionsForOrderResponseLinks actions(List<LinkObject> actions) {
        this.actions = actions;
        return this;
    }

    public GetMessagingActionsForOrderResponseLinks addActionsItem(LinkObject actionsItem) {
        this.actions.add(actionsItem);
        return this;
    }

    /**
     * Eligible actions for the specified amazonOrderId.
     *
     * @return actions
     **/
    @Schema(required = true, description = "Eligible actions for the specified amazonOrderId.")
    public List<LinkObject> getActions() {
        return actions;
    }

    public void setActions(List<LinkObject> actions) {
        this.actions = actions;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        GetMessagingActionsForOrderResponseLinks getMessagingActionsForOrderResponseLinks = (GetMessagingActionsForOrderResponseLinks) o;
        return Objects.equals(this.self, getMessagingActionsForOrderResponseLinks.self) &&
                Objects.equals(this.actions, getMessagingActionsForOrderResponseLinks.actions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(self, actions);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GetMessagingActionsForOrderResponseLinks {\n");
        sb.append("    self: ").append(toIndentedString(self)).append("\n");
        sb.append("    actions: ").append(toIndentedString(actions)).append("\n");
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
